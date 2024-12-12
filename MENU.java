/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NHAHANG;
import java.util.HashMap;

/**
 *
 * @author ThankPad
 */
public class MENU {
    HashMap<String,MON> menu = new HashMap<String,MON>();

    public MENU() {
    }
    
    public void ThemMon(MON mon) {
        menu.put(mon.getTenMon(), mon);
    }
    public void XoaMon(MON mon) {
        menu.remove(mon.getTenMon());
    }
    public void CapNhatGia(MON mon,double giaMoi) {
        mon.setGiaBan(giaMoi);
    }
    public void InMenu() {
        System.out.println("MENU NHA HANG :");
        for (MON value : menu.values()) {
            System.out.printf("%-30s %.2f VND\n",value.getTenMon(),value.getGiaBan());
        }
    }
}
