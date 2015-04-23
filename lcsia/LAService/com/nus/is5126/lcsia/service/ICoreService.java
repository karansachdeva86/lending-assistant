/*


 *  
 *  @version     1.0, Nov 8, 2014
 *  @author karan
 */
package com.nus.is5126.lcsia.service;

import java.util.List;

import com.nus.is5126.lcsia.entity.LoanProcessed;
import com.nus.is5126.lcsia.form.MasterForm;

public interface ICoreService {

    public List<String> getStateList();

    public List<LoanProcessed> getLoanResults(MasterForm masterForm);

}
