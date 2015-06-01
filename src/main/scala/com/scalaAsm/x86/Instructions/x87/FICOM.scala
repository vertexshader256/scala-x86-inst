package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare Integer
// Category: general/compar

trait FICOM extends InstructionDefinition {
  val mnemonic = "FICOM"
}

object FICOM extends OneOperand[FICOM] with FICOMImpl

trait FICOMImpl extends FICOM {
  implicit object _0 extends OneOp[m32] {
    val opcode: OneOpcode = 0xDA /+ 2
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[m16] {
    val opcode: OneOpcode = 0xDE /+ 2
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
