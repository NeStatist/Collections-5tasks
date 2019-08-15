package com.company.task5;

import java.util.*;

public class MapKeyValue {

    public static class MapKey {
        private String Model;

        @Override
        public boolean equals(Object obj) {
            if(obj == null) {
                return false;
            }
            if(obj == this) {
                return true;
            }
            if(!(obj instanceof MapKey)) {
                return false;
            }
            MapKey temp = (MapKey) obj;
            return this.Model.equals(temp.Model);
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 31 * result + Model.hashCode();
            return result;
        }

        @Override
        public String toString() {
            return Model;
        }

        public MapKey(String Model) {
            this.Model = Model;
        }

        public String getModel() {
            return Model;
        }

        public void setModel(String model) {
            this.Model = model;
        }
    }

    public static class MapValue {
        private Integer power;

        @Override
        public boolean equals(Object obj) {
            if(obj == null) {
                return false;
            }
            if(obj == this) {
                return true;
            }
            if(!(obj instanceof MapValue)) {
                return false;
            }

            MapValue temp = (MapValue) obj;
            return this.power.equals(temp.power);
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 31 * result + power.hashCode();
            return result;
        }


        @Override
        public String toString() {
            return power.toString();
        }

        public MapValue(Integer power) {
            this.power = power;
        }

        public Integer getPower() {
            return power;
        }

        public void setPower(Integer power) {
            this.power = power;
        }
    }
    public static HashMap<MapKey, MapValue> sortHashMapByValue(HashMap<MapKey, MapValue> map) {
        List<Map.Entry<MapKey, MapValue>> list = new LinkedList<Map.Entry<MapKey, MapValue>>(map.entrySet());
        Collections.sort(list, new ValueComparator());
        HashMap<MapKey, MapValue> temp = new LinkedHashMap<MapKey, MapValue>();
        for(Map.Entry<MapKey, MapValue> entry : list) {
            temp.put(entry.getKey(), entry.getValue());
        }
        return temp;
    }


    public static class ValueComparator implements Comparator<Map.Entry<MapKey, MapValue>> {

        @Override
        public int compare(Map.Entry<MapKey, MapValue> o1, Map.Entry<MapKey, MapValue> o2) {
            return (o1.getValue()).getPower().compareTo(o2.getValue().getPower());
        }
    }
}
