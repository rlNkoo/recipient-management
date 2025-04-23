package pl.rlnkoo.patientservice.service;

import org.springframework.stereotype.Service;
import pl.rlnkoo.patientservice.dto.PatientResponseDTO;
import pl.rlnkoo.patientservice.mapper.PatientMapper;
import pl.rlnkoo.patientservice.model.Patient;
import pl.rlnkoo.patientservice.repository.PatientRepository;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients() {
        List<Patient> patients = patientRepository.findAll();

        return patients
                .stream()
                .map(PatientMapper::toDTO)
                .toList();
    }
}
