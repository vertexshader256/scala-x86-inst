package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Fast System Call
// Category: general/branch

trait SYSENTER extends InstructionDefinition {
  val mnemonic = "SYSENTER"
}

object SYSENTER extends ZeroOperands[SYSENTER] with SYSENTERImpl

trait SYSENTERImpl extends SYSENTER {
  implicit object SYSENTER_0 extends _0 {
    val opcode: TwoOpcodes = (0x0F, 0x34)
        override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
