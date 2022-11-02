/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedrapapeltesoura;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author borbo
 */
public class logica {
    public static void main(String[] args) {
        Conectar con = new Conectar();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner use = new Scanner(System.in);
        Scanner sen = new Scanner(System.in);
        Scanner ema = new Scanner(System.in);
        
        Scanner userlog = new Scanner(System.in);
        Scanner senlog = new Scanner(System.in);
        
        int ptoshumano = 0;
        int ptosvirtual = 0;
        String user = "";
        int estrelas = 0;
        
        
        String escolha;
        
        String email;
        String usuario;
        String senha;
        
        String emaillog;
        String usuariolog;
        String senhalog;
        int id = 0;
        
            
            System.out.println("Deseja se registrar ou logar com um usuário já existente?");
            System.out.println("Digite 'reg' para adicionar e 'login' para logar. Para checar seus pontos digite 'status'.");
            escolha = sc2.nextLine();
            
            if( escolha == "reg"){
                
            }
            
            
            else if(escolha == "login"){
                System.out.println("Usuário: ");
                usuariolog = userlog.nextLine();
                
                System.out.println("Senha: ");
                senhalog = senlog.nextLine();
            }
            
            else if(escolha == "status"){
                System.out.println("Qual usuário deseja verificar?");
                usuario = use.nextLine();
                
                /* quantas estrelas o usuário tem*/
                
            }
            
            else{
                System.out.println("E-mail: ");
                email = ema.nextLine();
                
                System.out.println("Usuário: ");
                usuario = use.nextLine();
                
                System.out.println("Senha: ");
                senha = sen.nextLine();
                
                Entrada registro = new Entrada();
                registro.setEmail(email);
                registro.setUsuario(usuario);
                registro.setSenha(senha);
                con.inserir(registro);
                
                con.getValues();    
                
                System.out.println("confirme: ");
                //con.getValues();
                
                id = id++;
            }
            
            
        
        while(true){
            
            String[] ppt= {"pedra", "papel", "tesoura"};
            String fuziladavirtual = ppt[new Random().nextInt(ppt.length)];
            String fuziladahumana = null;
            int round = 1;
            boolean status;
            
            String ctn;
            
            
            while(status = true){
                if (round>4){
                    status = false;
                    break;
                }
                
            for (int i=0; i<=4; i++){
                System.out.println("-------------------------------------------------");
                System.out.println("ROUND" + round + "!");
                System.out.println("(serão 4 rounds)");
                System.out.println("-------------------------------------------------");
            System.out.println("Escolha seu movimento: pedra, papel ou tesoura?");
            System.out.println("*lembre-se de escrever tudo em letra minúscula.*");

            fuziladahumana = sc.nextLine();

            if(fuziladahumana.equals("pedra") || fuziladahumana.equals("papel") || fuziladahumana.equals("tesoura")){
                break;
            }

                System.out.println("O movimento '"+ fuziladahumana +"' não é válido.");
            }

            System.out.println("O computador escolheu "+ fuziladavirtual + ".");

            if(fuziladavirtual.equals(fuziladahumana)){
                System.out.println("---------------------------------------------");
                System.out.println("EMPATE!!!");
                System.out.println("Você continua com "+ptoshumano+" pontos.");
                System.out.println("O computador continua com "+ptosvirtual+" pontos.");
                System.out.println("---------------------------------------------");
                
            }
            else if(fuziladavirtual.equals("pedra")){
                if(fuziladahumana.equals("papel")){
                    System.out.println("---------------------------------------------");
                    System.out.println("Você ganhou!");
                    ++ptoshumano;
                    System.out.println("Você tem "+ptoshumano+" pontos.");
                    System.out.println("O computador tem "+ptosvirtual+" pontos.");
                    System.out.println("---------------------------------------------");
                }
                else if(fuziladahumana.equals("tesoura")){
                    System.out.println("---------------------------------------------");
                    System.out.println("Você perdeu!");
                    ++ptosvirtual;
                    System.out.println("Você tem "+ptoshumano+" pontos.");
                    System.out.println("O computador tem "+ptosvirtual+" pontos.");
                    System.out.println("---------------------------------------------");
                }
            }

            else if(fuziladavirtual.equals("papel")){
                if(fuziladahumana.equals("tesoura")){
                    System.out.println("---------------------------------------------");
                    System.out.println("Você ganhou!");
                    ++ptoshumano;
                    System.out.println("Você tem "+ptoshumano+" pontos.");
                    System.out.println("O computador tem "+ptosvirtual+" pontos.");
                    System.out.println("---------------------------------------------");
                }
                else if(fuziladahumana.equals("pedra")){
                    System.out.println("---------------------------------------------");
                    System.out.println("Você perdeu!");
                    ++ptosvirtual;
                    System.out.println("Você tem "+ptoshumano+" pontos.");
                    System.out.println("O computador tem "+ptosvirtual+" pontos.");
                    System.out.println("---------------------------------------------");
                }
            }

            else if(fuziladavirtual.equals("tesoura")){
                if(fuziladahumana.equals("pedra")){
                    System.out.println("---------------------------------------------");
                    System.out.println("Você ganhou!");
                    ++ptoshumano;
                    System.out.println("Você tem "+ptoshumano+" pontos.");
                    System.out.println("O computador tem "+ptosvirtual+" pontos.");
                    System.out.println("---------------------------------------------");
                }
                else if(fuziladahumana.equals("papel")){
                    System.out.println("---------------------------------------------");
                    System.out.println("Você perdeu!");
                    ++ptosvirtual;
                    System.out.println("Você tem "+ptoshumano+" pontos.");
                    System.out.println("O computador tem "+ptosvirtual+" pontos.");
                    System.out.println("---------------------------------------------");
                }
            }
            round++;
            }
            
            if(ptosvirtual > ptoshumano){
                System.out.println("---------------------------------------------");
                System.out.println("O Computador ganhou esta rodada!");
                System.out.println("Cuidado com a dominação tecnológica.");
                estrelas++;
                System.out.println("Você acabou com "+ ptoshumano +" pontos.");
                System.out.println("---------------------------------------------");
                
            }
            else if(ptosvirtual < ptoshumano){
                System.out.println("---------------------------------------------");
                System.out.println("Você ganhou essa rodada, parabéns!!");
                System.out.println("Você acabou com "+ ptoshumano +" pontos.");
                estrelas++;
                System.out.println("O usuário " + user +" obteve "+ estrelas + " estrelas ✭✭✭✭." );
                System.out.println("---------------------------------------------");
            }
            
            
            System.out.println("Continuar? digite sim ou não.");
            ctn = sc.nextLine();
            
            ptoshumano = 0;
            ptosvirtual = 0;
            
            
            if(!ctn.equals("sim")){
                System.out.println("Então obrigado!");
                break;
            }
            else{
                System.out.println("!NOVA RODADA!");
            }
            
            
            }
            
        }
        
}



