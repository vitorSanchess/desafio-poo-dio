import java.time.LocalDate;

import model.Bootcamp;
import model.Curso;
import model.Dev;
import model.Mentoria;

public class App {
        public static void main(String[] args) throws Exception {
                Curso curso1 = new Curso();
                curso1.setTitulo("curso java");
                curso1.setDescricao("descricao curso java");
                curso1.setCargaHoraria(12);

                Curso curso2 = new Curso();
                curso2.setTitulo("curso .net");
                curso2.setDescricao("descricao curso .net");
                curso2.setCargaHoraria(10);

                Mentoria mentoria = new Mentoria();
                mentoria.setTitulo("mentoria de java");
                mentoria.setDescricao("descricao mentoria java");
                mentoria.setData(LocalDate.now());

                Bootcamp bootcamp = new Bootcamp();
                bootcamp.setNome("Bootcamp Java Developer");
                bootcamp.setDescricao("Descrição Bootcamp Java Developer");
                bootcamp.addConteudo(curso1);
                bootcamp.addConteudo(curso2);
                bootcamp.addConteudo(mentoria);
                // bootcamp.addConteudo(mentoria);

                // System.out.println(bootcamp.getConteudos());
                // bootcamp.removeConteudo(mentoria);
                // System.out.println(bootcamp.getConteudos());
                // bootcamp.removeConteudo(mentoria);

                Dev devCarlos = new Dev();
                devCarlos.setNome("Carlos");
                devCarlos.inscreverBootcamp(bootcamp);
                System.out.println("Conteúdos Inscritos Carlos:" +
                                devCarlos.getConteudosInscritos());
                devCarlos.progredir();
                devCarlos.progredir();
                System.out.println("Conteúdos Inscritos Carlos:" +
                                devCarlos.getConteudosInscritos());
                System.out.println("Conteúdos Concluídos Carlos:" +
                                devCarlos.getConteudosConcluidos());

                System.out.println("-------");

                Dev devMaria = new Dev();
                devMaria.setNome("Maria");
                devMaria.inscreverBootcamp(bootcamp);
                System.out.println("Conteúdos Inscritos Maria:" +
                                devMaria.getConteudosInscritos());
                devMaria.progredir();
                devMaria.progredir();
                devMaria.progredir();
                System.out.println("Conteúdos Inscritos Maria:" +
                                devMaria.getConteudosInscritos());
                System.out.println("Conteúdos Concluídos Maria:" +
                                devMaria.getConteudosConcluidos());
                System.out.println("XP:" + devMaria.calcularTotalXp());

                System.out.println("-------");

                Dev devRicardo = new Dev("Ricardo");
                devRicardo.inscreverBootcamp(bootcamp);
                System.out.println("Conteúdos Inscritos Ricardo:" + devRicardo.getConteudosInscritos());
                System.out.println(bootcamp.getDevsInscritos());

        }
}
