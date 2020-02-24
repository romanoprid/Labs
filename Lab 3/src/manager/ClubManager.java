package manager;
import model.*;

import java.util.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ClubManager {
    private List<Good> goods;

    public ClubManager() {
        this.goods = new LinkedList<Good>();
    }

    public void add(Good goods) {
        this.goods.add(goods);
    }

    public List<Good> find(Purpose purpose) {
       List<Good> res = new LinkedList<>();
        for (Good g : this.goods) {
            if(g.getPurpose()==purpose){
                res.add(g);
            }
        }
        return res;
    }

    public void sortByName(boolean isIncrease) {
        if (isIncrease) {
            this.goods.sort(new CompareByName());
        } else {
            this.goods.sort(new CompareByNameDecrease());
        }
    }

    public void sortByPrice(boolean isIncrease) {
        if (isIncrease) {
            this.goods.sort(new CompareByPrice());
        } else {
            this.goods.sort(new CompareByPriceDecrease());
        }
    }
    public List<Good> findMinPrice(Purpose purpose) {
        List<Good> res = new LinkedList<Good>();
        List<Good> purposeGoods = new LinkedList<Good>();
        for (Good g:goods) {
            if(g.getPurpose()==purpose){
                purposeGoods.add(g);
            }
        }
        Good minGood = Collections.min(purposeGoods,new CompareForFindPrice());
        Iterator<Good> it = goods.iterator();
        while (it.hasNext()){
            Good g = it.next();
            if((g.getPurpose()==purpose) && (g.getPriceInUAH()==minGood.getPriceInUAH())){
                res.add(g);
            }
        }
        return res;
    }


    @Override
    public String toString() {
        String res = "";
        for (Good g : this.goods) {
            res += g.toString() + "\n";
        }
        return res;
    }
}
