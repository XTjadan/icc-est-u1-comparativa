public class Results {
    private String name;
    private long duration;
    private String sample;
    public Results(String name, long duration, String sample) {
        this.name = name;
        this.duration = duration;
        this.sample = sample;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getDuration() {
        return duration;
    }
    public void setDuration(long duration) {
        this.duration = duration;
    }
    public String getSample() {
        return sample;
    }
    public void setSample(String sample) {
        this.sample = sample;
    }
    @Override
    public String toString() {
        double milisegundos = duration/1_000_000.0;
        double segundos = duration/1_000_000_000.;
        /* 
        return "Results name:  " + name + "| duration: " + duration + "ns" + "| Milisegundos: " + milisegundos + "ms"  
        + "| Segundos: " + segundos + "s" +  "| sample: " + sample ;
        */

       return String.format(
        "Results name: %-18s| duration: %10dns| Milisegundos: %9.4fms| Segundos: %8.6fs| sample: %s",
        name, duration, milisegundos, segundos, sample);
    }

    






















}
