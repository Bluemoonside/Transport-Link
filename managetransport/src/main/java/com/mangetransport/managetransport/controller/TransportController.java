package com.mangetransport.managetransport.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mangetransport.managetransport.model.Trasport;
import com.mangetransport.managetransport.service.TransportService;

@RestController
@RequestMapping("api/tranport")
public class TransportController {

    private final TransportService trasportService;

    public TransportController(TransportService trasportService) {
        this.trasportService = trasportService;
    }

    @GetMapping("/api/trasport/{id}")
    public Trasport byId(@PathVariable("id") int id) {
        return trasportService.find(id);
    }

    @PostMapping("/api/trasport/")
    public Trasport create(@RequestBody Trasport trasport) {
        return this.trasportService.create(trasport);
    }

    @PutMapping("/api/trasport/")
    public Trasport update(@RequestBody Trasport trasport) {
        return trasportService.update(trasport);
    }

    @PatchMapping("/api/trasport/")
    public Trasport change(@RequestBody Trasport trasport) {
        return trasportService.change(trasport);
    }

    @DeleteMapping("/api/trasport/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return trasportService.remove(id);
    }

}