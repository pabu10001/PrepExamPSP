package PruebaSincronizacion;

public class sumArray {
	private int sum;

    public sumArray() {
    }

    //sumArray está sincronizado
	synchronized int sumArray(int nums[]){

		sum = 0;
        for (int num : nums) {
            sum += num;
            System.out.println("total de " + Thread.currentThread().getName() + " es " + sum);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }

		return sum;
	}
}
