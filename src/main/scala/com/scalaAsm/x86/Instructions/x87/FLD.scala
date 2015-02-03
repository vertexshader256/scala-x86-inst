package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Floating Point Value
// Category: general/datamov

object FLD extends InstructionDefinition("FLD") with FLDImpl

trait FLDImpl {
//  implicit object FLD_0 extends FLD._1[STi/m32] {
//    val opcode: OneOpcode = 0xD9 /+ 0
//    override def hasImplicitOperand = true
//  }

  implicit object FLD_1 extends FLD._1[m64] {
    val opcode: OneOpcode = 0xDD /+ 0
    override def hasImplicitOperand = true
  }
}
