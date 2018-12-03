package org.freakz.hokan_ng_springboot.bot.common.jpa.repository;

import org.freakz.hokan_ng_springboot.bot.common.jpa.entity.CommandHistory;
import org.freakz.hokan_ng_springboot.bot.common.jpa.entity.CommandStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Petri Airio on 15.5.2015.
 */
public interface CommandHistoryRepository extends JpaRepository<CommandHistory, Long> {

    List<CommandHistory> findByHokanModule(String module);

    List<CommandHistory> findByHokanModuleAndSessionId(String module, long sessionId);

    List<CommandHistory> findByHokanModuleAndSessionIdAndCommandStatus(String module, long sessionId, CommandStatus status);

}
