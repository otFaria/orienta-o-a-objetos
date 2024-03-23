package classes;
import java.util.Scanner;

public class Menu {
    public static void Menu() {

        System.out.println("Escolha uma opção:");
        System.out.println("1. Calcular área de um triângulo");
        System.out.println("2. Verificar tipo de triângulo");
        System.out.println("3. Calcular perímetro de um triângulo");
        System.out.println("4. Calcular área de um quadrado");
        System.out.println("5. Calcular perímetro de um quadrado");
        System.out.println("6. Verificar tipo de quadrado");
        System.out.println("7. Sair");
        System.out.print("Selecione a opcao: ");
    }
    
    public static void Implementacao(){
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            Menu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Triangulo triangulo = new Triangulo();
                    triangulo.Preencher();
                    double areaTriangulo = triangulo.Area();
                    System.out.println("Área do triângulo: " + areaTriangulo);
                    break;
                case 2:
                    Triangulo tipoTriangulo = new Triangulo();
                    tipoTriangulo.Preencher();
                    System.out.println(tipoTriangulo.Tipo());
                    break;
                case 3:
                    Triangulo perimetroTriangulo = new Triangulo();
                    perimetroTriangulo.Preencher();
                    perimetroTriangulo.PerimetroDoTriangulo();
                    break;
                case 4:
                    Quadrado quadrado = new Quadrado();
                    quadrado.fill();
                    quadrado.area();
                    break;
                case 5:
                    Quadrado perimetroQuadrado = new Quadrado();
                    perimetroQuadrado.fill();
                    perimetroQuadrado.perimetro();
                    break;
                case 6:
                    Quadrado tipoQuadrado = new Quadrado();
                    tipoQuadrado.fill();
                    tipoQuadrado.tipos();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        } while (opcao != 7);
    }
}
