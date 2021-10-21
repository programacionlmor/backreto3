package grupo17_04_11.spring11.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import grupo17_04_11.spring11.modelo.Planeta;
import grupo17_04_11.spring11.repositorio.RepositorioPlaneta;

@Service
public class ImplementacionServiciosPlaneta implements ServiciosPlaneta {
   

    @Autowired
    RepositorioPlaneta repositorioPlaneta;


    
    @Override
    public List<Planeta> listarPlanetas() {
        return (List <Planeta>) repositorioPlaneta.findAll();
    }
  
        
    @Override
    public Optional<Planeta>listarPlanetaId(Integer id) {
        return repositorioPlaneta.findById(id);
    }
        
   
        
}
