/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luat.service.impl;

import luat.model.DaoDich;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class GiaoDichService {
    private List<DaoDich> list= new ArrayList<>();
    public GiaoDichService() {
        list.add(new DaoDich("lucluat", "12-2-2022", "lục văn luật", "gd001", "giờ chơi", "100000", "20000",
                "80000", 0, 0));
        list.add(new DaoDich("lucluat", "12-2-2022", "lục văn luật", "gd002", "giờ chơi", "100000", "20000",
                "80000", 0, 0));
        list.add(new DaoDich("lucluat", "12-2-2022", "lục văn luật", "gd003", "giờ chơi", "100000", "20000",
                "80000", 0, 0));
        list.add(new DaoDich("lucluat", "12-2-2022", "lục văn luật", "gd004", "giờ chơi", "100000", "20000",
                "80000", 0, 0));
        list.add(new DaoDich("lucluat", "12-2-2022", "lục văn luật", "gd005", "giờ chơi", "100000", "20000",
                "80000", 0, 0));
        list.add(new DaoDich("lucluat", "12-2-2022", "lục văn luật", "gd006", "giờ chơi", "100000", "20000",
                "80000", 0, 0));
    }

    public List<DaoDich> getList() {
        return list;
    }

    public void setList(List<DaoDich> list) {
        this.list = list;
    }
    
}
