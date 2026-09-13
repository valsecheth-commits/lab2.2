package org.example;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter

public class Scene  {

    private List<Shape> objects;

    public Scene(List<Shape> objects) {
        this.objects = objects;
    }

    void draw() {
        for (Shape shape : getObjects()) {
            shape.draw();
        }
    }
}
