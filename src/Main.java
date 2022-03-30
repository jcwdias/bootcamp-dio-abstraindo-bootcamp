import br.com.dio.projetobootcamp.Bootcamp;
import br.com.dio.projetobootcamp.Curso;
import br.com.dio.projetobootcamp.Dev;
import br.com.dio.projetobootcamp.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJean = new Dev();
        devJean.setNome("Jean");
        devJean.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jean: "+ devJean.getConteudosInscritos());
        devJean.progredir();
        devJean.progredir();
        System.out.println("Conteúdos Inscritos Jean: "+ devJean.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jean: "+ devJean.getConteudosConcluidos());
        System.out.println("XP: "+ devJean.calcularTotalXp());

        System.out.println("--------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: "+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Inscritos João: "+ devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jean: "+ devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());
    }
}
