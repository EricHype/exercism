
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

final class Flattener {


    public List<Object> flatten(List<Object> list) {
        return flatMapToStream(list)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

    }

    public Stream<Object> flatMapToStream(Object obj){
        return obj instanceof List ? ((List<Object>)obj).stream().flatMap(this::flatMapToStream) : Stream.of(obj);
    }

}
