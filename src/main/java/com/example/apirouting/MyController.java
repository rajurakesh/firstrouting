/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.GetMapping;
 * import org.springframework.web.bind.annotation.RestController;
 * 
 */

// Write your code here.
package com.example.apirouting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    MyService ms = new MyService();

    @GetMapping("/")
    public String HomePage() {
        return ms.HomePage();
    }

    @GetMapping("/About")
    public String AboutPage() {
        return ms.AboutPage();
    }
}
