package com.example.JavaProject.repository;

import com.example.JavaProject.model.Anunturi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface AnunturiRepository extends JpaRepository<Anunturi, Long> {

    List<Anunturi> findBySport(String sport);

    List<Anunturi> findByMonthInEqualsAndMonthOutEquals(Long dataIN, Long dataOUT);

    @Transactional
    void deleteAnunturiByIdAnunt(Long id);

    @Modifying
    @Query(nativeQuery = true,
            value = "update anunturi a set a.pret = :pret where a.id_anunt = :id")
    void updatePretById(double pret, Long id);

    @Modifying
    @Query(nativeQuery = true,
    value = "INSERT INTO anunturi (id_anunt, month_in, month_out, pret, sport, id_localitate, id_regiune, id_tara)\n" +
            "select max(id_anunt) + 1, :monthin, :monthout, :pret, :sport, :idlocalitate, :idregiune,:idtara from anunturi ;")
    void adaugareAnunt(Long monthin, Long monthout, Double pret, String sport, Long idlocalitate, Long idregiune, Long idtara);


}
