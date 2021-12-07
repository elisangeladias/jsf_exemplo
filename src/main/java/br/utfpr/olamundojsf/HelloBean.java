/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.utfpr.olamundojsf;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {
    private String mensagem;
    
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String msg) {
        this.mensagem = msg;
    }
}

