package tacocloud.domains.taco;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Taco {
    @NotNull
    @Size(min = 5, message = "Name should be at least 5 characters long")
    private String name;

    @Size(min = 1, message = "Please select at least one ingredient")
    private List<String> ingredients;
}
