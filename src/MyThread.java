/** @author - Rodrigo Tavares
 * @docente - Aníbal Ponte
 * */

public class MyThread extends Thread {

    static Parameters params;
    static SavedData data;

    long time;
    static long maxTime;

    /**
     * Builder for MyThread
     * @param params - the parameters
     */
    public MyThread(Parameters params) {
        MyThread.params = params;
    }

    /**
     * The method that each thread will do
     */
    @Override
    public void run() {
        Individual ind = new Individual(params);
        ind.setFinalEval(Integer.MAX_VALUE);
        int iterations = 0;
        int bestIteration = 0;

        long initialTime = System.currentTimeMillis();
        long finalTime;
        long bestTime = 0;

        Population population = new Population(params);
        for (Individual individual : population.getList()) {
            if (ind.getFinalEval() > individual.getFinalEval()) {
                ind.updateInd(individual);
                bestTime = this.time;
                bestIteration = iterations;
            }
        }

        do{
            iterations++;
            population.generateChilds();
            population.compare();

            finalTime = System.currentTimeMillis();
            this.time = finalTime - initialTime;

            for (Individual individual : population.getList()) {
                if (ind.getFinalEval() > individual.getFinalEval()) {
                    ind.updateInd(individual);
                    bestTime = this.time;
                    bestIteration = iterations;
                }
            }
        } while (this.time < maxTime);

        data.writeData(ind,bestTime,bestIteration);
    }
}
