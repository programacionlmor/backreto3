package grupo17_04_11.spring11.controlador;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import grupo17_04_11.spring11.modelo.Planeta;
import grupo17_04_11.spring11.servicio.ServiciosPlaneta;

import java.util.List;
import java.util.Optional;


//OPERACIONES CRUD  - LISTAR
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class HolaControlador {

            //Listar Planetas
            @Autowired
            ServiciosPlaneta  serviciosPlaneta;
           
            @GetMapping("/planetas")
            public List<Planeta>  obtenerPlanetas() {
               return serviciosPlaneta.listarPlanetas();              
            }

            @GetMapping("/planetas/{id}")
            public Optional<Planeta> obtenerPlanetasId(@PathVariable("id") Integer id){
                return serviciosPlaneta.listarPlanetaId(id);
            }


            
 }


