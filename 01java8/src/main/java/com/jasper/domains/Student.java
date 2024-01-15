package com.jasper.domains;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Student {
    @NonNull
    private String name;
    @NonNull
    private String age;

    private String hobby;


}
