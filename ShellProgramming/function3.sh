#!/bin/bash
name="Prince"
defLocal(){
    name="Durgesh"
    return
}
echo $name
defLocal
echo $name