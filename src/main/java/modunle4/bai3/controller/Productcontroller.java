package modunle4.bai3.controller;

import modunle4.bai3.model.Product;
import modunle4.bai3.service.IProductSevice;
import modunle4.bai3.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
@Controller
@RequestMapping("/product")
public class Productcontroller {
    private final IProductSevice productSevice= new ProductService();

    @GetMapping("")
    public String index(Model model) {
        List<Product> productList = productSevice.findall();
        model.addAttribute("products", productList);
        return "/index";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("products", new Product());
        return "/create";
    }
    @PostMapping("/save")
    public String save(Product product) {
        //product.setId((int) (Math.random() * 10000));
        productSevice.save(product);
        return "redirect:/product";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("products", productSevice.findById(id));
        return "/edit";
    }
    @PostMapping("/update")
    public String update(Product product) {
        productSevice.update(product.getId(), product);
        return "redirect:/product";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("products", productSevice.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        productSevice.remove(product.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/product";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productSevice.findById(id));
        return "/view";
    }
}
