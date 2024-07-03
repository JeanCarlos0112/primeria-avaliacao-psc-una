import java.util.Scanner;

public class Estimativacustocombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a placa do veículo:");
        String placaVeiculo = scanner.nextLine();
        System.out.println("Digite o valor do combustivel:");
        double valorCombustivel = scanner.nextDouble();
        System.out.println("Digite a quantidade de quilômetros rodados a 60 KM/H");
        double quilometrosRodados60 = scanner.nextDouble();
        System.out.println("Digite a quantidade de quilômetros rodados a 80 KM/H");
        double quilometrosRodados80 = scanner.nextDouble();
        System.out.println("Digite a quantidade de quilômetros rodados a 100 KM/H");
        double quilometrosRodados100 = scanner.nextDouble();
        System.out.println("Digite a quantidade de quilômetros rodados a 120 KM/H");
        double quilometrosRodados120 = scanner.nextDouble();
        System.out.println("Digite a quantidade de quilômetros rodados a 140 KM/H");
        double quilometrosRodados140 = scanner.nextDouble();
        double quantidadeCombustivel60 = (10.0/307) * quilometrosRodados60;
        double quantidadeCombustivel80 = (10.0/268) * quilometrosRodados80;
        double quantidadeCombustivel100 = (10.0/224) * quilometrosRodados100;
        double quantidadeCombustivel120 = (10.0/181) * quilometrosRodados120;
        double quantidadeCombustivel140 = (10.0/145) * quilometrosRodados140;
        double quantidadeTotalCombustivel = quantidadeCombustivel60 + quantidadeCombustivel80 + quantidadeCombustivel100 + quantidadeCombustivel120 + quantidadeCombustivel140;
        double tempo60 = quilometrosRodados60 / 60,tempo80 = quilometrosRodados80 / 80, tempo100 = quilometrosRodados100 / 100, tempo120 = quilometrosRodados120 / 120, tempo140 = quilometrosRodados140 / 140; 
        double velocidadeMediaPonderada = ((60 * tempo60) + (80 * tempo80) + (100 * tempo100) + (120 * tempo120) + (140 * tempo140)) / (tempo60 + tempo80 + tempo100 + tempo120 + tempo140);
        double custoTotalViagem = ((quilometrosRodados60 / 30.7) + (quilometrosRodados80 / 26.8) + (quilometrosRodados100 / 22.4) + (quilometrosRodados120 / 18.1) + (quilometrosRodados140 / 14.5)) * valorCombustivel;
        System.out.println("Placa do veículo: " + placaVeiculo);
        System.out.println(String.format("Consumo total: %.4f litros", quantidadeTotalCombustivel));
        System.out.println(String.format("Valor total: R$%.2f",custoTotalViagem));
        System.out.println(String.format("Velocidade média ponderada: %.4fkm/h", velocidadeMediaPonderada));
        scanner.close();
    }
}
