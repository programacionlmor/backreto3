package grupo17_04_11.spring11.servicio;

import java.util.List;
import java.util.Optional;

import grupo17_04_11.spring11.modelo.Planeta;

public interface ServiciosPlaneta {
 
   public List<Planeta> listarPlanetas();
   public Optional<Planeta> listarPlanetaId(Integer id );
  
}
