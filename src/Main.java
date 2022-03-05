import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso javaCurso  = new Curso();
        Curso jsCurso = new Curso();
        Mentoria mentoria = new Mentoria();


        javaCurso.setTitulo("Curso Java");
        javaCurso.setDescricao("Descrição curso Java");
        javaCurso.setCargaHoraria(8);

        jsCurso.setTitulo("Curso Java Script");
        jsCurso.setDescricao("Descrição Js");
        jsCurso.setCargaHoraria(4);

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(javaCurso);
        System.out.println(jsCurso);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("java Developer");
        bootcamp.setDescricao("Aprendizado de java");
        bootcamp.getConteudos().add(javaCurso);
        bootcamp.getConteudos().add(jsCurso);
        bootcamp.getConteudos().add(mentoria);

        Dev marcos = new Dev();
        marcos.setNome("Marcos Tavares");
        marcos.inscreverBootcamp(bootcamp);
        System.out.println("Dev: "+marcos.getNome());
        System.out.println("Conteúdos Inscritos" + marcos.getConteudosInscritos());
        System.out.println("XP "+marcos.CalcularTotalXp());
        marcos.progredir();
        marcos.progredir();
        System.out.println("Dev: "+marcos.getNome());
        System.out.println("Conteúdos Inscritos" + marcos.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + marcos.getConteudosConcluidos());
        System.out.println("XP "+marcos.CalcularTotalXp());

        System.out.println("\n\n----------------------| |---------------------------\n\n ");
        Dev jose = new Dev();
        jose.setNome("Jose Maria");
        jose.inscreverBootcamp(bootcamp);
        System.out.println("Dev: "+jose.getNome());
        System.out.println("Conteúdos Inscritos" + jose.getConteudosInscritos());
        System.out.println("XP "+jose.CalcularTotalXp());
        jose.progredir();
        System.out.println("Dev: "+jose.getNome());
        System.out.println("Conteúdos Inscritos" + jose.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + jose.getConteudosConcluidos());
        System.out.println("XP "+jose.CalcularTotalXp());



    }
}
