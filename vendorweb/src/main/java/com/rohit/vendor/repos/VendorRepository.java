package com.rohit.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohit.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
