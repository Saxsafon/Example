package webapp;

import enteties.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import programms.Methods;

import java.lang.reflect.Method;


@Controller // это штука называется аннотация. Без нее ничего не будет работать.
// Она сообщает компилятору, что этот класс - контроллер
public class WebController {
    private Methods m = new Methods();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView starter() { // Это функция запускает первую странницу

        Person person = new Person();
        // Мы передаем шаблону start мы передаем некую модель с именем name, который является пустым объектом класса person
        return new ModelAndView("start","name",person); // затем мы заполняем его на странице
        // и при нажатии кнопки show запускается следующая функция
    }

    @RequestMapping(value = "/show", method = RequestMethod.POST) // Насколько я понял, эти аннотации связывают шаблоны с функциями (посмотрите на тег form)
    public ModelAndView show(Person person) { // функция принимает заполненный нами объект
        m.addId(person); // здесь мы писваеваем этому объекту ID (В принципе, можем делать с ним что захотим)
        // Теперь запускаем шаблон show и передаем ему наш объект person, и называем его так же "person"
        return new ModelAndView("show","person",person);
    }
}
