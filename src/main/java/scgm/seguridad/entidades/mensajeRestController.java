package scgm.seguridad.entidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/mensaje")
public class mensajeRestController {

    @Autowired
    private mensajeRepository mensajeRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<mensaje> findAll() {
        return mensajeRepository.findAll();
    }
    
	@RequestMapping(method = RequestMethod.GET, value = "/{mensajeId}")
    public mensaje findOne(@PathVariable Long mensajeId) {
        return mensajeRepository.findOne(mensajeId);
    }
    
	@RequestMapping(method = RequestMethod.POST)
    public mensaje add(@RequestBody mensaje mensaje) {
        return mensajeRepository.save(mensaje);
    }

	@RequestMapping(method = RequestMethod.PUT)
    public mensaje update(@RequestBody mensaje mensaje) {
        return mensajeRepository.save(mensaje);
    }
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{mensajeId}")
    public void delete(@PathVariable Long mensajeId) {
        mensajeRepository.delete(mensajeId);
    }
	
}

