package org.freakz.hokan_ng_springboot.bot.common.jpa.repository;

import org.freakz.hokan_ng_springboot.bot.common.jpa.entity.DataValues;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Petri Airio on 31.8.2015.
 */
public interface DataValuesRepository extends JpaRepository<DataValues, Long> {

    DataValues findByNickAndNetworkAndKeyName(String nick, String network, String keyName);

}
