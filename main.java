public class main {
    public static void main(String[] args) throws Exception {
        Funcionarios funcionario1 = new Funcionarios("Rodrigo", 25000,  20);
        Funcionarios funcionario2 = new Funcionarios("Jefferson", 22000,  18);
        Funcionarios funcionario3 = new Funcionarios("João", 30000,  25);
        Funcionarios funcionario4 = new Funcionarios("Rafael", 23000,  17);
        Funcionarios funcionario5 = new Funcionarios("Fabio Gabriel", 26000,  18);
        Funcionarios funcionario6 = new Funcionarios("Bruno Henrique", 900000,  15);
        float[] arraySalario = {funcionario1.salario, funcionario2.salario, funcionario3.salario, funcionario4.salario, funcionario5.salario, funcionario6.salario};
        int[] arrayExperiencia = {funcionario1.anosDeExperiencia, funcionario2.anosDeExperiencia, funcionario3.anosDeExperiencia, funcionario4.anosDeExperiencia, funcionario5.anosDeExperiencia, funcionario6.anosDeExperiencia};
        SelectionSort organizarSalario = new SelectionSort();
        SelectionSort organizarExperiencia = new SelectionSort();
        arraySalario = organizarSalario.CrescenteSelectionSort(arraySalario);
        arrayExperiencia = organizarExperiencia.DecrescenteSelectionSort(arrayExperiencia);
        System.out.println("Por salário: \n");
        for (int i = 0; i < arraySalario.length; i++) {
            System.out.println(arraySalario[i]);
        }
        System.out.println("Por experiência: \n");
        for (int i = 0; i < arraySalario.length; i++) {
            System.out.println(arrayExperiencia[i]);
        }
    
    }
}
