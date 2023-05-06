/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rahmah060523.Model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LABP1KOMP
 */
public class BukuDaoImpl implements BukuDao {
    List<Buku> data = new ArrayList<>();
    
    public BukuDaoImpl(){
        data.add(new Buku("11111", "Laskar Pelangi", "Andrea Hirata", "Bentang Pustaka", "2005"));
        data.add(new Buku("11112", "Spider-Man", "Stan Lee", "Marvel comic", "1962"));
        data.add(new Buku("11113", "Perjuangan", "Ali", "Perpustakaan", "2008"));
    }
    
    public void save(Buku buku){
        data.add(buku);
    }
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Buku getBuku(int index){
        return data.get(index);
    }
    public List <Buku> getAll(){
        return data;
    }
    
}
