
package rpa;
import classes.Aluno;
import java.util.ArrayList;

import classes.Curso;
import classes.Funcionario;
import classes.Professor;
import classes.Trabalho;
import conect.ConectFactory;
import java.util.Locale;
import telas.TelaAdicionarUsuario;
import telas.TelaBusca;
import telas.TelaCadastroTrabalho;
import telas.TelaCadastroAluno;
import telas.TelaCadastroFuncionario;
import telas.TelaCadastroProfessor;
import telas.TelaInicialAluno;
import telas.TelaInicialFuncionario;
import telas.TelaInicialProfessor;
import telas.TelaLogin;
import telas.TelaPerfilAluno;
import telas.TelaPerfilFuncionario;
import telas.TelaPerfilProfessor;
import telas.TelaSUBPerfilAluno;
import telas.TelaSUBPerfilFuncionario;
import telas.TelaSUBPerfilProfessor;
import telas.TelaTrabalho;
import telas.testePDF;

/**
 *
 * @author edfer
 */
public class RPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Locale.setDefault(new Locale("pt", "BR")); // Configuração para o Brasil
        
        
        //Conexão com o banco de dados
        
        try {
             ConectFactory teste = new ConectFactory();
             teste.getConnection();
             System.out.println("Conectado com Sucesso");
        } catch (Exception e) {
            System.out.println("Banco não conectado com Sucesso");
        }
        //Fim da Conexão
        
        
       
        
        //Inserção de Dados para Teste
        /*
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Trabalho> trabalhos = new ArrayList<>();
          
         
        funcionarios.add(new Funcionario(12345678, "Coordenador da Engenharia da Computação", 12345678, 3, "João da Silva", "123.456.789-00", "37 99999-9999", "joao.silva@email.com", "senha123"));
        System.out.println("Cadastrado");
        cursos.add(new Curso("Engenharia da Computação", 12345678));
       
        professores.add(new Professor(11121314, "Doutora", 11121314, "Professora Titular de Física", 11121314, 2, "Luana Costa", "177.189.198-00", "37 9988-7766", "luana.costa@email.com", "123senha"));
        
        alunos.add(new Aluno(1694479, "Engenharia da Computação", 1694479, 1, "Eduardo Fernandes Paiva Ribeiro", "144.145.046-78", "37 96666-6666", "eduardo.ribeiro@email.com", "123456"));
        
       
       */
       //Testes Telas
        
         /*
       TelaLogin teste = new TelaLogin();
        teste.setVisible(true);
       
       ------------------------------------------------------
       //Telas Iniciais
        TelaInicialAluno teste5 = new TelaInicialAluno();
        teste5.setVisible(true);
         
       
        TelaInicialFuncionario teste6 = new TelaInicialFuncionario();
        teste6.setVisible(true);
       
        TelaInicialProfessor teste10 = new TelaInicialProfessor();
        teste10.setVisible(true);
       
       ------------------------------------------------------
       //Tela Adicionar Uuasrio
        
        TelaAdicionarUsuario teste7 = new TelaAdicionarUsuario();
        teste7.setVisible(true);
       
       ------------------------------------------------------
       // Tela de Busca
       TelaBusca teste9 = new TelaBusca();      
        teste9.setVisible(true);
          
       ------------------------------------------------------
       //Telas de Perfil
      
        TelaPerfilAluno teste11 = new TelaPerfilAluno();
        teste11.setVisible(true);
       
       TelaPerfilProfessor teste12 = new TelaPerfilProfessor();
        teste12.setVisible(true);
       
       TelaPerfilFuncionario teste13 = new TelaPerfilFuncionario();
        teste13.setVisible(true);
       
       -------------------------------------------------------
       //Telas de SUB PERFIL
       
       TelaSUBPerfilAluno teste14 = new TelaSUBPerfilAluno();
        teste14.setVisible(true);
      
       TelaSUBPerfilProfessor teste15 = new TelaSUBPerfilProfessor();
        teste15.setVisible(true);
        
        TelaSUBPerfilFuncionario teste16 = new TelaSUBPerfilFuncionario();
        teste16.setVisible(true);
       
       ---------------------------------------------------------
        //Telas Cadastro
        
       TelaCadastroAluno teste2 = new TelaCadastroAluno();
        teste2.setVisible(true);
       
        TelaCadastroProfessor teste3 = new TelaCadastroProfessor();
        teste3.setVisible(true);
        
        TelaCadastroFuncionario teste4 = new TelaCadastroFuncionario();
        teste4.setVisible(true);
       
       TelaCadastroTrabalho teste8 = new TelaCadastroTrabalho();
        teste8.setVisible(true);
       
        testePDF teste18 = new testePDF();
        teste18.setVisible(true);
       
       //Tela Trabalho
       TelaTrabalho teste17 = new TelaTrabalho(12);
        teste17.setVisible(true);
       ------------------------------------------------------
        
         */
         
        TelaLogin teste = new TelaLogin();
        teste.setVisible(true);
         
         
       
      
          
        
       
       
      
        
        
       
        

    
    }
    
}
