import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("descrção mentoria Java");
        mentoria1.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Vinicius");

        Dev dev2 = new Dev();
        dev2.setNome("Joao");

        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos incritos pelo dev: " + dev1.getNome()
                + ": " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos incritos pelo dev: " + dev1.getNome()
                + ": " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos pelo dev: " + dev1.getNome()
                + ": " + dev1.getConteudosConcluidos());
        dev1.progredir();
        System.out.println("XP: " + dev1.calcularTotalXP());

        System.out.println("Conteúdos incritos pelo dev: " + dev2.getNome()
                + ": " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos incritos pelo dev: " + dev2.getNome()
                + ": " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos pelo dev: " + dev2.getNome()
                + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXP());

    }

}
