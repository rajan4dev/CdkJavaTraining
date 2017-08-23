package com.example.scope;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

@Component
@Scope("singleton")
public class Employee {
	
}