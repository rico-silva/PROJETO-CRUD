package com.example.PROJETO.CRUD;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {

    /* O controller é a porta de entrada do pedido (ex: usuário clicou em "Cadastrar").
    Aqui dentro ficam os métodos de criação, registro, atualização e delete de um usuário.
     */

    /*
    ----------------------------------------------------------------------------------------
     */

    // Metodo para criação de usuário.
    @PostMapping("/user")
    public String createUser(@RequestBody UserRequest userRequest) {
        return "usuário criado" + userRequest.getName();
    }

    //----------------------------------------------------------------------------------------

    // Metodo para acessar todas as informações do usuário através do ID
    @GetMapping("/user/pesquisa-user-id")
    public UserRequest getById(UserRequest userRequest) {
        return userRequest;
    }

    //----------------------------------------------------------------------------------------

    // Metodo para alterar de usuário
    @PutMapping("/user/id")
    public UserRequest updateUser(UserRequest userRequest) {
        System.out.println("Usuário alterado com sucesso");
        return userRequest;
    }

    //----------------------------------------------------------------------------------------

    // Metodo para apagar de usuário.
    @DeleteMapping("/user/id")
    public UserRequest deleteUser(UserRequest userRequest) {
        System.out.println("Você deseja deletar este usário?");
        return userRequest;
    }


}
