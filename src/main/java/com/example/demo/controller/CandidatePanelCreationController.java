
package com.example.demo.controller;
 
 import java.util.List;
 
  import org.springframework.beans.factory.annotation.Autowired; 
  import org.springframework.web.bind.annotation.CrossOrigin; 
  import org.springframework.web.bind.annotation.DeleteMapping; 
  import org.springframework.web.bind.annotation.GetMapping; 
  import org.springframework.web.bind.annotation.PostMapping; 
  import
 org.springframework.web.bind.annotation.PutMapping; 
  import
 org.springframework.web.bind.annotation.RequestBody; 
  import
 org.springframework.web.bind.annotation.RequestParam; 
  import
 org.springframework.web.bind.annotation.RestController;
  import com.example.demo.model.CandidatePanelCreationModel; 
  import
 com.example.demo.service.CandidatePanelCreationService;
 
 @RestController
 
 @CrossOrigin public class CandidatePanelCreationController {

 @Autowired CandidatePanelCreationService candidatePanelCreationService;

 @PostMapping("/CandidatePanelCreation") public CandidatePanelCreationModel
 saveJ(@RequestBody CandidatePanelCreationModel candidatePanelCreationModel) {
 return candidatePanelCreationService.saveC(candidatePanelCreationModel);
 
 }
 
@GetMapping("/CandidatePanelCreation1") public
 List<CandidatePanelCreationModel> getJ() {
 
 return candidatePanelCreationService.getC(); }
 
 @DeleteMapping("/DeleteCandidatePanelCreation") void delrow(@RequestParam
 Integer id) { candidatePanelCreationService.deleteRec(id); }
 
 @PutMapping("/updateCandidatePanelCreation") public
 CandidatePanelCreationModel updatefaciltyregistration(@RequestBody
 CandidatePanelCreationModel candidatePanelCreationModel) { return
 candidatePanelCreationService.updateCandidatePanelCreation(
 candidatePanelCreationModel);
 
 } }
