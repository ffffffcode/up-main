package ex.aaronfae.controller;

import ex.aaronfae.entity.Homework;
import ex.aaronfae.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class UploadController {

    private static List<Homework> homeworkList;

    static {
        homeworkList = new ArrayList<>();
        homeworkList.add(new Homework("af","vv.jpg"));
    }

    private final UploadService uploadService;

    @Autowired
    public UploadController(UploadService uploadService) {
        this.uploadService = uploadService;
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String up(@RequestParam("homework") MultipartFile homework, @RequestParam("uper") String uper, HttpServletRequest request) throws IOException {
        //getSize()方法获取文件的大小来判断是否有上传文件
        if (homework.getSize() > 0) {
            //获取保存上传文件的file文件夹绝对路径
            String path = request.getSession().getServletContext().getRealPath("file");
            //获取上传文件名
            String fileName = homework.getOriginalFilename();
            File file = new File(path, fileName);
            homework.transferTo(file);
            //保存上传之后的文件路径
            homeworkList.add(uploadService.getHomeWork(uper, fileName));
            Iterator it = homeworkList.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
            request.setAttribute("msg", "上传成功");
            return "index";
        }
        request.setAttribute("msg", "请上传文件，bro");
        return "index";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("HomeworkList", homeworkList);
        return "list";
    }
}
