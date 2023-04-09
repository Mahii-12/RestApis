/**
 * 
 */
package exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author SAMSUNG
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException {

	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String message){
    	super();
	}
}
