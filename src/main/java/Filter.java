import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int treshold;
    public Filter(int treshold){
        this.treshold=treshold;
    }
    public List<Integer>filterOut(List<Integer> sourse){
        List<Integer>out=new ArrayList<>();
        Logger logger= Logger.getInstance();
        sourse.forEach(a->{if (a>treshold) {out.add(a);
        logger.log("Значение "+ a +" прошло фильтр");}
        else {logger.log("Значение "+ a +" не прошло фильтр");}});
    return out;
    }
}
