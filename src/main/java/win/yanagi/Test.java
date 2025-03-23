package win.yanagi;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.stream.Collectors;

public class Test {
   public static List<Player> getOnlinePlayersList() {
      return Bukkit.getOnlinePlayers().stream().collect(Collectors.toList());
   }
}
