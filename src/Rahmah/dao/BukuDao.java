/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rahmah.dao;

import Rahmah.model.Buku;
import java.util.List;

/**
 *
 * @author LABP1KOMP
 */
public interface BukuDao {
    void insert (Buku buku) throws Exception;
    void update (Buku buku) throws Exception;
    void delete (Buku buku) throws Exception;
    Buku getBuku(String kodebuku) throws Exception;
    List<Buku> getAll() throws Exception;
}
