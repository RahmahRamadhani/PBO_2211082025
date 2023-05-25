/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_B;
import java.util.List;
/**
 *
 * @author LABP1KOMP
 */
public interface PegawaiDao {
    void save(Pegawai pegawai);
    void update(int index, Pegawai pegawai);
    void delete(int index);
    Pegawai getPegawai(int index);
    List<Pegawai> getAll();
}
