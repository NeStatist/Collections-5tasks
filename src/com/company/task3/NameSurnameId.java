package com.company.task3;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class NameSurnameId {
        public static class User implements Comparator<User> {
            private final int id = count++;
            private String name;
            private String surname;
            private static int count = 0;

            @Override
            public int compare(User user, User t1) {
                return 0;
            }

            @Override
            public boolean equals(Object object) {
                if(object == null) {
                    return false;
                }
                if(object == this) {
                    return true;
                }

                User user = (User) object;
                return (this.id == user.id) && (this.name.equals(user.name)) && (this.surname.equals(user.surname));
            }

            @Override
            public Comparator<User> reversed() {
                return null;
            }

            @Override
            public Comparator<User> thenComparing(Comparator<? super User> other) {
                return null;
            }

            @Override
            public <U> Comparator<User> thenComparing(Function<? super User, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
                return null;
            }

            @Override
            public <U extends Comparable<? super U>> Comparator<User> thenComparing(Function<? super User, ? extends U> keyExtractor) {
                return null;
            }

            @Override
            public Comparator<User> thenComparingInt(ToIntFunction<? super User> keyExtractor) {
                return null;
            }

            @Override
            public Comparator<User> thenComparingLong(ToLongFunction<? super User> keyExtractor) {
                return null;
            }

            @Override
            public Comparator<User> thenComparingDouble(ToDoubleFunction<? super User> keyExtractor) {
                return null;
            }

            @Override
            public int hashCode() {
                int result = 17;
                result = 31 * result + id;
                result = 31 * result + name.hashCode();
                result = 31 * result + surname.hashCode();
                return result;
            }

            @Override
            public String toString() {
                return id + " " + surname + " " + name;
            }

            public User(String name, String surname) {
                this.name = name;
                this.surname = surname;
            }

            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getSurname() {
                return surname;
            }

            public void setSurname(String surname) {
                this.surname = surname;
            }

            public static int getCount() {
                return count;
            }

            public static void setCount(int count) {
                User.count = count;
            }
        }

        public static class UserComparator implements Comparator<User> {
            @Override
            public int compare(User userf, User usert) {
                return Integer.compare(userf.getId(), usert.getId());
            }
        }


    }