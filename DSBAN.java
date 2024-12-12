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
public class DSBAN {
    HashMap<Integer,BAN> dsban = new HashMap<Integer,BAN>();

    public DSBAN() {
    }
    
    public void ThemBan(BAN ban) {
        dsban.put(ban.getSoBan(),ban);
    }
    public void XoaBan(BAN ban) {
        dsban.remove(ban.getSoBan());
    }
    public void CapNhatSoGhe(BAN ban, int soLuong) {
        ban.setSoGhe(soLuong);
    }
    public void CapNhatTrangThai(BAN ban, String trangThai) {
        ban.setTrangThai(trangThai);
    }
    
    public void INBAN() {
        System.out.println("Moi chon ban: ");
        for(BAN values : dsban.values()) {
            System.out.printf("Ban so %2d, so luong ghe %3d, trang thai %s\n",values.getSoBan(),values.getSoGhe(),values.getTrangThai());
        }
    }
}
