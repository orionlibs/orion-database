package io.github.orionlibs.orion_database;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;

public interface OrionModel extends Cloneable, Serializable
{
    @JsonIgnore
    public abstract OrionModel getCopy();
}