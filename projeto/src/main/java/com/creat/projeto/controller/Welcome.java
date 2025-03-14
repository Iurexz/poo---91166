package com.creat.projeto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Welcome {
        
@RequestMapping("/textbox")
public String textbox(@RequestParam(value = "input", defaultValue = "Digite algo") String input) {

        return "<html>" +
            "<head>" +
            "<style>" +
            "body { font-family: Arial, sans-serif; margin: 20px; }" +
            "form { margin-bottom: 20px; }" +
            "label { display: block; margin-bottom: 5px; }" +
            "input[type='text'] { padding: 5px; margin-bottom: 10px; width: 300px; }" +
            "input[type='submit'] { padding: 5px 10px; }" +
            "p { margin-top: 10px; }" +
            "button { padding: 5px 10px; margin-top: 10px; }" +
            "</style>" +
            "</head>" +
            "<body>" +
            "<form action='/welcome/textbox' method='get'>" +
            "<label for='input'>Texto:</label>" +
            "<input type='text' id='input' name='input' value='" + input + "'>" +
            "<input type='submit' value='Enviar'>" +
            "</form>" +
            "<p>Você digitou: " + input + "</p>" +
            "<button onclick=\"window.location.href='/welcome/form'\">Ir para Formulário</button>" +
            "</body>" +
            "</html>";
}

@RequestMapping("/form")
public String form(@RequestParam(value = "name", defaultValue = "") String name,
                   @RequestParam(value = "age", defaultValue = "") String age,
                   @RequestParam(value = "cpf", defaultValue = "") String cpf) {
    return "<html>" +
           "<head>" +
           "<style>" +
           "body { font-family: Arial, sans-serif; margin: 20px; }" +
           "form { margin-bottom: 20px; }" +
           "label { display: block; margin-bottom: 5px; }" +
           "input[type='text'] { padding: 5px; margin-bottom: 10px; width: 300px; }" +
           "input[type='submit'] { padding: 5px 10px; }" +
           "p { margin-top: 10px; }" +
           "</style>" +
           "</head>" +
           "<body>" +
           "<form action='/welcome/form' method='get'>" +
           "<label for='name'>Nome:</label>" +
           "<input type='text' id='name' name='name' value='" + name + "'><br>" +
           "<label for='age'>Idade:</label>" +
           "<input type='text' id='age' name='age' value='" + age + "'><br>" +
           "<label for='cpf'>CPF:</label>" +
           "<input type='text' id='cpf' name='cpf' value='" + cpf + "'><br>" +
           "<input type='submit' value='Enviar'>" +
           "</form>" +
           "<p>Nome: " + name + "</p>" +
           "<p>Idade: " + age + "</p>" +
           "<p>CPF: " + cpf + "</p>" +
           "<button onclick=\"window.location.href='/welcome/textbox'\">Voltar</button>" +
           "</body>" +
           "</html>";
}
}
