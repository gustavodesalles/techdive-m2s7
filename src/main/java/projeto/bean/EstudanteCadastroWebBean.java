package projeto.bean;

import org.omnifaces.cdi.Param;
import projeto.dto.EstudanteDTO;
import projeto.service.EstudanteService;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@ViewScoped
@Named("estudanteCadastroWebBean")
public class EstudanteCadastroWebBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private EstudanteDTO estudanteDTO = new EstudanteDTO();

    @Param(name = "idEstudante")
    private Long idEstudante;

    @Inject
    private EstudanteService estudanteService;
}
